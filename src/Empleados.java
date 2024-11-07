public class Empleados {
    private int EMP_NO;
    private String APELLIDO;
    private String OFICIO;
    private int DIR;
    private String FECHA_ALT;
    private int SALARIO;
    private int COMISION;
    private int DEPT_NO;

    public Empleados(int EMP_NO, String APELLIDO, String OFICIO, int DIR, String FECHA_ALT, int SALARIO, int COMISION, int DEPT_NO) {
        this.EMP_NO = EMP_NO;
        this.APELLIDO = APELLIDO;
        this.OFICIO = OFICIO;
        this.DIR = DIR;
        this.FECHA_ALT = FECHA_ALT;
        this.SALARIO = SALARIO;
        this.COMISION = COMISION;
        this.DEPT_NO = DEPT_NO;
    }

    public int getEMP_NO() {
        return EMP_NO;
    }

    public void setEMP_NO(int EMP_NO) {
        this.EMP_NO = EMP_NO;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getOFICIO() {
        return OFICIO;
    }

    public void setOFICIO(String OFICIO) {
        this.OFICIO = OFICIO;
    }

    public int getDIR() {
        return DIR;
    }

    public void setDIR(int DIR) {
        this.DIR = DIR;
    }

    public String getFECHA_ALT() {
        return FECHA_ALT;
    }

    public void setFECHA_ALT(String FECHA_ALT) {
        this.FECHA_ALT = FECHA_ALT;
    }

    public int getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(int SALARIO) {
        this.SALARIO = SALARIO;
    }

    public int getCOMISION() {
        return COMISION;
    }

    public void setCOMISION(int COMISION) {
        this.COMISION = COMISION;
    }

    public int getDEPT_NO() {
        return DEPT_NO;
    }

    public void setDEPT_NO(int DEPT_NO) {
        this.DEPT_NO = DEPT_NO;
    }
}
