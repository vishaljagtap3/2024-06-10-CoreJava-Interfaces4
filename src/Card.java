public class Card implements Loggable{
    private int no;
    private String nameOnCard;

    public Card(int no, String nameOnCard) {
        this.no = no;
        this.nameOnCard = nameOnCard;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    @Override
    public void log() {
        System.out.println("Log Card: " + no);
    }

    @Override
    public void info() {
        System.out.println("Info card: " + no);
    }
}
