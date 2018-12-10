public class Card {
    String rank, suit;
    int pointValue;
    public Card(String r, String s, int pv){
        rank = r;
        suit = s;
        pointValue = pv;
    }
    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }
    public int getPointValue(){
        return pointValue;
    }
    public boolean equals(Card otherCard){
        if(this.getPointValue() == otherCard.getPointValue()){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Rank: " + rank + " | Suit: " + suit + " | Point Value: " + pointValue;
    }
}
