package pokerBase;

import java.util.ArrayList;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Hand {

	private ArrayList<Card> CardsInHand;

	private ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	private static boolean isHandFlush(ArrayList<Card> cards) {
		
		boolean bIsFlush = false;
		// still need change the following question, actually it just the one question and we need do test one this .

		if (getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == getCardsInHand().
						get(eCardNo.SecondCard.getCardNo()).geteSuit()
				&& getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == getCardsInHand().
						get(eCardNo.ThirdCard.getCardNo()).geteSuit()
				&& getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == getCardsInHand()
						.get(eCardNo.FourthCard.getCardNo()).geteSuit()
				&& getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == getCardsInHand()
						.get(eCardNo.FifthCard.getCardNo()).geteSuit()) {
			bIsFlush = true;
		
		}

		
		return bIsFlush;
	}

	private static boolean isStraight(ArrayList<Card> cards, Card highCard) {
		boolean bIsStraight = false;
		/*if (CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank() == eRank.KING
				&& CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == eRank.QUEEN
				&& CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == eRank.JACK
				&& CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == eRank.TEN) {
			bIsStraight = true;
		}*/
		if (CardsInHand.get(eCardNo.FirstCard) == 14){
			if (CardInHand.get(eCardNo.ThirdCard.getCardNo()) - CardInHand.get(eCardNo.SecondCard.getCardNo()) == 1 
					&& CardInHand.get(eCardNo.FourthCard.getCardNo())- CardInHand.get(eCardNo.ThirdCard.getCardNo()==1)
					&& CardInhand.get(eCardNo.FifthCard.getCardNo())- CardInHand.get(eCardNo.FourthCard.getCardNo() == 1)){
				bIsStraight = true;
				
			}
		if(CardInHand.get(eCardNo.SecondCard.getCardNo() - CardInHand.get(eCardNo.FirstCard.getCardNo() == 1))
				&& CardInHand.get(eCardNo.ThirdCard.getCardNo()) - CardInHand.get(eCardNo.SecondCard.getCardNo()) == 1 
				&& CardInHand.get(eCardNo.FourthCard.getCardNo())- CardInHand.get(eCardNo.ThirdCard.getCardNo()==1)
				&& CardInhand.get(eCardNo.FifthCard.getCardNo())- CardInHand.get(eCardNo.FourthCard.getCardNo() == 1)){
				bIsStraight = true;
		}
			}
			
		

		return bIsStraight;
	
}

	public static boolean isHandRoyalFlush(Hand h, HandScore hs) {

		boolean isRoyalFlush = false;
		if (bIsStraight == true && bIsFlush == true && h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteRank() == eRank.TEN
				) {
			isRoyalFlush = true;
			hs.setHandStrength(eHandStrength.RoyalFlush.getHandStrength());
			
			
		}
		return isRoyalFlush;
	}

	public static boolean isHandStraightFlush(Hand h, HandScore hs) {
		boolean isHandStraightFlush = false;
		
		if (bIsStraight == true && bIsFlush == true){
			
			isHandStraightFlush = true;
			hs.setHandStrength(eHandStrength.StraightFlush.getHandStrength());
			
		}
		
		return isHandStraightFlush;
	}

	public static boolean isHandFourOfAKind(Hand h, HandScore hs) {

		boolean bHandCheck = false;

		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FourthCard.getCardNo()).geteRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FifthCard.getCardNo()).geteRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			hs.setKickers(kickers);
		}

		return bHandCheck;
	}

	public static boolean isHandFullHouse(Hand h, HandScore hs) {

		boolean isFullHouse = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()
			&& h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() == h.getCardsInHand()
					.get(eCardNo.FifthCard.getCardNo()).geteRank()){
				isFullHouse = true;
				hs.setHandStrength(eHandStrength.FullHouse.getHandStrength());
			}
		return isFullHouse;

	}

	public static boolean isHandFlush(Hand h, HandScore hs) {

		boolean bIsFlush = false;
		if (bIsFlush == true){
			hs.setHandStrength(eHandStrength.Flush.getHandStrength());
			bIsFlush = true;
			
		}
		return bIsFlush;
	}

	public static boolean isHandStraight(Hand h, HandScore hs) {

		boolean bIsStraight = false;
		if (bIsStraight == true){
			bIsStraight = true;
			hs.setHandStrength(eHandStrength.Straight.getHandStrength());
			
		}
		return bIsStraight;
	}

	public static boolean isHandThreeOfAKind(Hand h, HandScore hs) {

		boolean isThreeOfAKind = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			isThreeOfAKind = true;
			
		}
		else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FourthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			isThreeOfAKind = true;
		}
		else if (h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FifthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			isThreeOfAKind = true;
			
		}
		return isThreeOfAKind;
	}

	public static boolean isHandTwoPair(Hand h, HandScore hs) {

		boolean isTwoPair = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.SecondCard.getCardNo()).geteRank()
				&& h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() == h.getCardsInHand()
						.get(eCardNo.FourthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			isTwoPair = true;
			
		}
		else if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.SecondCard.getCardNo()).geteRank()
				&& h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() == h.getCardsInHand()
						.get(eCardNo.FifthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			isTwoPair = true;
			
		}
		else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()
				&& h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() == h.getCardsInHand()
						.get(eCardNo.FifthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			isTwoPair = true;
			
		}
		return isTwoPair;
	}

	public static boolean isHandPair(Hand h, HandScore hs) {
		boolean isPair = false;
		
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.SecondCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			isPair = true;
			
		}
		else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			isPair = true;
			
		}
		else if (h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FourthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			isPair = true;
			
		}
		else if(h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FifthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			isPair = true;
			
		}
		return isPair;
	}

	public static boolean isHandHighCard(Hand h, HandScore hs) {
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() != h.getCardsInHand()
				.get(eCardNo.SecondCard.getCardNo()).geteRank()
				&& h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() != h.getCardsInHand()
						.get(eCardNo.ThirdCard.getCardNo()).geteRank()
				&& h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() != h.getCardsInHand()
						.get(eCardNo.FourthCard.getCardNo()).geteRank()
				&& h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() != h.getCardsInHand()
						.get(eCardNo.FifthCard.getCardNo()).geteRank()){
			hs.setHandStrength(eHandStrength.HighCard.getHandStrength());
			
			
		}
		return true;
	}
}
