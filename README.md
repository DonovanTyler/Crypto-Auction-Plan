# Crypto-Auction-Plan
Auction plan for NFTs
  For users:
    Highest bid obtains the NFT
    Users can spend ccryptocurrency in order to compete with other users for the highest bid
    The amount that a user can bid cannot exceed the current amount in their wallet
    If a user starts an auction, they are allowed to select the duration for which the auction goes on
      This duration cannot exceed one year
    Only the bidder who obtains the NFT needs to pay the amount they bidded
  For system:
    Current highest bid is displayed to users
    When a user chooses to bid on an NFT that has less than 10 minutes remaining for the duration for which it is avaliable, then the remaining duration of the auction is set back to 10 minutes in order to prevent sniping
    Additionally, if no other bids are made after the duration of the auction is up, the auction is closed and the NFT goes to the highest bidder
