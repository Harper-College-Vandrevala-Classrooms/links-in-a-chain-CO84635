package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinksInAChainTest {

    LinksInAChain.LinkedList<LinksInAChain.ChainLink> links;

    @BeforeEach
    void setup(){
        links = new LinksInAChain.LinkedList<>();
    }

    @Test
    void testZeroLinks() {
        assertNull(links.get(0));
    }

    @Test
    void TestOneLink() {
        LinksInAChain.ChainLink blueLink = new LinksInAChain.ChainLink("Blue");
        links.add(blueLink);

        assertEquals("Blue", links.get(0).color);
    }

    @Test
    void TestMultipleLinks() {
        LinksInAChain.ChainLink greenLink = new LinksInAChain.ChainLink("Green");
        LinksInAChain.ChainLink redLink = new LinksInAChain.ChainLink("Red");
        LinksInAChain.ChainLink blueLink = new LinksInAChain.ChainLink("Blue");
        
        links.add(greenLink);
        links.add(redLink);
        links.add(blueLink);
        
        assertEquals("Green", links.get(0).color);
        assertEquals("Red", links.get(1).color);
        assertEquals("Blue", links.get(2).color);
    }

    @Test
    void testOutOfBounds () {
        LinksInAChain.ChainLink greenLink = new LinksInAChain.ChainLink("Green");
        links.add(greenLink);
        
        assertNull(links.get(1));
    }
}