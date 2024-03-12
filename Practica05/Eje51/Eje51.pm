// El proceso A debe ejecutarse antes que el proceso B
// El proceso C debe ejecutarse antes que el proceso D
// El proceso C debe ejecutarse antes que el proceso B

program Eje51;
  VAR s: SEMAPHORE:=0;
  VAR s2: SEMAPHORE:=0;

 PROCEDURE A;
    BEGIN
       writeln ("Soy el proceso A");
       signal(s);
    END;
 PROCEDURE B;
    BEGIN
       wait(s);
       writeln ("Soy el proceso B");
    END;
 PROCEDURE C;
    BEGIN
       writeln ("Soy el proceso C");
       signal(s);
       signal(s2);
    END;
 PROCEDURE D;
    BEGIN
       wait(s2);
       writeln ("Soy el proceso D");
    END;
BEGIN
  COBEGIN
    A;
    C;
    D;
    B;
  COEND;
END.
