// Si P1 llega a (*1*) antes que P2 a (*2*), P1 esperará a que P2 llegue a (*2*)
// Si P2 llega a (*2*) antes que P1 a (*1*), P2 esperará a que P1 llegue a (*1*)

program Eje52;
  VAR s: SEMAPHORE:=0;
  VAR s2: SEMAPHORE:=0;
 
PROCEDURE P1;
  BEGIN
    writeln ("Sentencia 1 de P1");
    signal(s2);
    wait(s);
    (* 1 *)
    writeln ("Sentencia 2 de P1");
  END;

PROCEDURE P2;
  BEGIN
    writeln ("Sentencia 1 de P2");
    signal(s);
    wait(s2);
    (* 2 *)
    writeln ("Sentencia 2 de P2");
  END;

BEGIN
  COBEGIN
    P1;
    P2;
  COEND
END.

