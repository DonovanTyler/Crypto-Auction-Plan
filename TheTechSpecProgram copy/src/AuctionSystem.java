import java.util.ArrayList;

public class AuctionSystem
{
	public ArrayList <NFT> nftList = new ArrayList<NFT>();
	public ArrayList <AuctionUser> userList = new ArrayList<AuctionUser>();
	
	public NFT addNFT (NFT nft)
	{
		nftList.add(nft);
		return (nft);
	}
	
	public NFT checkNFT (String address)
	{
		for (NFT nft : nftList)
		{
			if (nft.address.equals(address))
			{
				return(nft);
			}
		}
		return (null);
	}
}
