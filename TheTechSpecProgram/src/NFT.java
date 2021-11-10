public class NFT
{
	private Wallet ownerWallet;
	public String address;
	public double price;
	
	public NFT (Wallet ownerWallet, String address, double price)
	{
		this.ownerWallet = ownerWallet;
		this.address = address;
	}

	public void transferOwner(Wallet newOwner)
	{
		ownerWallet = newOwner;
	}
}