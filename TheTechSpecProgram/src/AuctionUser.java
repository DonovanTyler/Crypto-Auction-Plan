import java.util.ArrayList;
import java.util.LinkedList;

public class AuctionUser
{
	public Wallet wallet;
	public ArrayList <NFT> nftList = new ArrayList<NFT>();

	public AuctionUser (Wallet wallet)
	{
		this.wallet = wallet;
	}

	public void auction (NFT nft)
	{
		nftList.add(nft);
	}

	public void buyNFT (NFT nft, double offer)
	{
		if (nft != null)
		{
			if (offer >= nft.price)
			{
				completeNFTProcess (nft, offer);
			}
		}
		else
		{
			System.out.println ("Oops. This NFT doesn't exist.");
		}
	}

	public void completeNFTProcess (NFT nft, double offer)
	{
		wallet.money = wallet.money - nft.price;
		nft.transferOwner(wallet);
		nft.price = offer;
	}
}
