public class Departamentos {
    private int DEPT_NO;
    private String DNOMBRE;
    private String LOC;

    public Departamentos(int DEPT_NO, String DNOMBRE, String LOC) {
        this.DEPT_NO = DEPT_NO;
        this.DNOMBRE = DNOMBRE;
        this.LOC = LOC;
    }

    public int getDEPT_NO() {
        return DEPT_NO;
    }

    public void setDEPT_NO(int DEPT_NO) {
        this.DEPT_NO = DEPT_NO;
    }

    public String getDNOMBRE() {
        return DNOMBRE;
    }

    public void setDNOMBRE(String DNOMBRE) {
        this.DNOMBRE = DNOMBRE;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC;
    }
}
