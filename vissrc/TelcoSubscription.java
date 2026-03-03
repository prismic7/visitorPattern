public interface TelcoSubscription {

    String accept(UsagePromo promo, double promoPrice);
    String accept(UnliCallTextOffer offer, boolean unliCallText);
    
    
}