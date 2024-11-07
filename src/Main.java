import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Main {
    static String BDLib = "DBEmpresa.yap";

    public static void main(String[] args) {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BDLib);

        Departamentos d1 = new Departamentos( 1, "IT", "Barcelona" );
        Departamentos d2 = new Departamentos( 1, "IT", "Barcelona" );
        Departamentos d3 = new Departamentos( 1, "IT", "Barcelona" );
        Departamentos d4 = new Departamentos( 1, "IT", "Barcelona" );

        db.store( d1 );
        db.store( d2 );
        db.store( d3 );
        db.store( d4 );

        Empleados e1 = new Empleados( 1, "LOZANO", "Programador", 2, "16/02/93", 100000, 500, 4 );

        db.store( e1 );

        ObjectSet<Empleados> result = db.queryByExample(e1);

        //Consulta
        if (result.size() == 0)
            System.out.println("No existen registros (consulta)..");
        else {
            System.out.printf("Número de registros: %d %n", result.size());
            while (result.hasNext()){
                Empleados l = result.next();
                System.out.printf("Departamento: %s, Editorial: %s %n", l.getDEPT_NO());
            }
        }
    }
}