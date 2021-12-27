package BankInterface;

public class Bbank implements IBank{
    private String bankaAdı;
    private String terminalID;
    private String password;

    public Bbank(String bankaAdı, String terminalID, String password) {
        this.bankaAdı = bankaAdı;
        this.terminalID = terminalID;
        this.password = password;
    }

    public String getBankaAdı() {
        return bankaAdı;
    }

    public void setBankaAdı(String bankaAdı) {
        this.bankaAdı = bankaAdı;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println(this.bankaAdı + " baglandı");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İslem basarili oldu.");
        return true;
    }
}
