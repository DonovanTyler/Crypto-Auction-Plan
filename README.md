# Crypto-Auction-Plan
Auction plan for NFTs
  For users:
    Highest bid obtains the NFT
    Users can spend cryptocurrency in order to compete with other users for the highest bid
      The amount that a user can bid cannot exceed the current amount in their wallet
    Users can start an auction by selecting an NFT that they currently have to be auctioned
      Users must give the auctioned NFT a name under which it is sold (e.g. if I wanted to sell an NFT of a horse, I'd name the auctioned NFT "horse")
    If a user starts an auction, they are allowed to select the duration for which the auction goes on
      This duration cannot exceed one year and cannot be less than 30 minutes
    The user that started the auction can close the auction at any time during its duration
      Users have two options
        They can either choose for the NFT to go to the highest bidder (who then must pay what they bid for the NFT to the user who opened the auction) 
        OR 
        to remove the NFT from the auction and putting it back into the user's wallet (thus removing the NFT from sale and causing no one involved who bid to pay) after paying a minor fee (in order to deter users from constantly putting NFTs up for auction and then removing them)
    Only the bidder who wins the NFT needs to pay the amount they bidded
    Users can search for various NFTs on auction
  For system:
    Current highest bid is displayed to users
    The time for the duration of an auction starts immediately when the NFT is confirmed to have been put up for auction and published on our application
    When a user chooses to bid on an NFT that has less than 10 minutes remaining for the duration for which it is avaliable, then the remaining duration of the auction is set back to 10 minutes in order to prevent sniping
    Additionally, if no other bids are made after the duration of the auction is up, the auction is closed and the NFT goes to the highest bidder
    If no user bids on an NFT for the duration of the auction, the NFT is sent back to the wallet of the person who initially put it up
