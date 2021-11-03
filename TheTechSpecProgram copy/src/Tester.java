import java.util.*;

public class Tester
{
	public static void main(String[] args)
	{
		AuctionSystem system = new AuctionSystem ();

		Wallet userOneWallet = new Wallet ("1", 1000);
		Wallet userTwoWallet = new Wallet ("2", 20000);
		
		AuctionUser userOne = new AuctionUser (userOneWallet);
		AuctionUser userTwo = new AuctionUser (userTwoWallet);
		
		NFT newNFT = new NFT (userOne.wallet, "1", 0.5);
		userOne.auction (system.addNFT(newNFT));
		userTwo.buyNFT (system.checkNFT("1"), 1.05);
		
		System.out.print(userTwoWallet.money);
	}
}
