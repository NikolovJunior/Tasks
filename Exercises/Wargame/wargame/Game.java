package wargame;

public class Game {
	private static final int CARDS_TO_DRAW_IN_CASE_OF_WAR = 3;

	public static void main(String[] args) throws InterruptedException {
		Deck deck = new Deck();
		
		Player krasi = new Player(deck.getEvenHalf(), "Krasimir Nikolov");
		Player kobe = new Player(deck.getOddHalf(), "Young Kobe");
		
		while (!krasi.hasPlayerFinished()) {
			Card firstPlayerCard = krasi.playCard();
			Card secondPlayerCard = kobe.playCard();
			
			System.out.print("Krasi : " + firstPlayerCard);
			System.out.print("Kobe : " + secondPlayerCard);
			
			if (firstPlayerCard.compareTo(secondPlayerCard) > 0) {
				krasi.gatherCard(firstPlayerCard);
				krasi.gatherCard(secondPlayerCard);
				System.out.println("Krasi vzema");
			}
			
			if (firstPlayerCard.compareTo(secondPlayerCard) < 0) {
				kobe.gatherCard(firstPlayerCard);
				kobe.gatherCard(secondPlayerCard);
				System.out.println("Kobe vzema");
			}
			
			if (firstPlayerCard.compareTo(secondPlayerCard) == 0) {
				System.out.println("War !!!");
				Card[] drawnCards = new Card[Deck.NUMBER_OF_CARDS];
				drawnCards[0] = firstPlayerCard;
				drawnCards[1] = secondPlayerCard;
				int index = 2;
				
				while ((firstPlayerCard.compareTo(secondPlayerCard) == 0) && (!krasi.hasPlayerFinished())) {
					for (int count=1; count <= CARDS_TO_DRAW_IN_CASE_OF_WAR && (!krasi.hasPlayerFinished()); count++) {
						Card cardOfKrasi = krasi.playCard();
						Card cardOfKobe = kobe.playCard();
						
						drawnCards[index++] = cardOfKrasi;
						drawnCards[index++] = cardOfKobe;
						
						System.out.println("Sega " + krasi.getName() + " dade : " + cardOfKrasi);
						System.out.println("Sega "+ kobe.getName() + " dade : " + cardOfKobe);
						 
						Thread.sleep(1000);
					}
					firstPlayerCard = drawnCards[index-2];
					secondPlayerCard = drawnCards[index-1];
				}
				
				if (firstPlayerCard.compareTo(secondPlayerCard) > 0) {
					System.out.println("Winner after the war: " + krasi.getName());
					for (Card card : drawnCards) {
						krasi.gatherCard(card);
					}
				}
				
				if (firstPlayerCard.compareTo(secondPlayerCard) < 0) {
					System.out.println("Winner after the war: " + kobe.getName());
					for (Card card : drawnCards) {
					     kobe.gatherCard(card);
					}
				}
			}
			
			// wait 2 sec
			Thread.sleep(200);
		}
		
		System.out.println("Finalen rezultat - Krasi: " + krasi.kolkoSiVzel() + " Kobe: " + kobe.kolkoSiVzel());
		System.out.println("pecheli : " + ((krasi.kolkoSiVzel() > kobe.kolkoSiVzel()) ? " Krasi" : " Kobe"));
	}
}

