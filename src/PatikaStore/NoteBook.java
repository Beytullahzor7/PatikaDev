package PatikaStore;

public class NoteBook extends Products  {
    private int notebookId;
    private String ssd;

    public NoteBook(int notebookId, int unitPrice, int discountRate, int amount, String name,
                    String RAM, double screenSize,String ssd) {
        super(unitPrice, discountRate, amount, name, RAM, screenSize);
        this.ssd = ssd;
    }

    public int getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(int notebookId) {
        this.notebookId = notebookId;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }
}
