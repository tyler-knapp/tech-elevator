package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    @RequestMapping( path = "", method = RequestMethod.GET )
        public List<Auction> list(@RequestParam(required = false, defaultValue = "") String title_like,
                                  @RequestParam(required = false, defaultValue = "0") double currentBid_lte) {

        List<Auction> filteredAuctions = null;

        if (title_like.length() > 0 && currentBid_lte > 0) {
            filteredAuctions = dao.searchByTitleAndPrice(title_like,currentBid_lte);
        } else if (title_like.length() > 0){
            filteredAuctions = dao.searchByTitle(title_like);
        } else if (currentBid_lte > 0){
            filteredAuctions = dao.searchByPrice(currentBid_lte);
        } else
            filteredAuctions = dao.list();

//        List<Auction> auctionsByPriceAndTitle = dao.searchByTitleAndPrice(title_like, currentBid_lte);
//        for (Auction auction : auctions) {
//            if (auction.getCurrentBid() <= currentBid_lte && auction.getTitle().equalsIgnoreCase(title_like)) {
//                    auctionsByPriceAndTitle.add(auction);
//            }
//        }
        return filteredAuctions;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)

        public Auction get(@PathVariable int id){
        Auction auction = dao.get(id);
        return auction;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
        public Auction create(@RequestBody Auction auction){
        Auction auctions = dao.create(auction);
        return auctions;
    }
}
