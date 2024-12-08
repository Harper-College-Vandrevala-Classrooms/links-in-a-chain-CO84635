package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.csc.LinksInAChain.ChainLink;
import com.csc.LinksInAChain.ComputerParts;
import com.csc.LinksInAChain.StrawHats;

class LinksInAChainTest {

    LinksInAChain.LinkedList<LinksInAChain.ChainLink> links;
    LinksInAChain.LinkedList<LinksInAChain.StrawHats> strawhats;
    LinksInAChain.LinkedList<LinksInAChain.ComputerParts> parts;

    @BeforeEach
    void setup(){
        links = new LinksInAChain.LinkedList<>();
        strawhats = new LinksInAChain.LinkedList<>();
        parts = new LinksInAChain.LinkedList<>();
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
    void TestSizeOnLinks(){
        LinksInAChain.ChainLink greenLink = new LinksInAChain.ChainLink("Green");
        LinksInAChain.ChainLink redLink = new LinksInAChain.ChainLink("Red");
        LinksInAChain.ChainLink blueLink = new LinksInAChain.ChainLink("Blue");
        links.add(greenLink);
        links.add(redLink);
        links.add(blueLink);
        LinksInAChain.Node<ChainLink> nodeForRed = links.head;
        assertEquals(2, links.size(nodeForRed));
    }

    @Test
    void testOutOfBounds () {
        LinksInAChain.ChainLink greenLink = new LinksInAChain.ChainLink("Green");
        links.add(greenLink);
        assertNull(links.get(1));
    }

    @Test
    void testSizeFromLastNode() {
        LinksInAChain.ChainLink lastLink = new LinksInAChain.ChainLink("Last");
        links.add(lastLink);
        LinksInAChain.Node<LinksInAChain.ChainLink> lastNode = links.head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        assertEquals(0, links.size(lastNode)); 
    }

    @Test
    void testSizeFromEmptyNode() {
        LinksInAChain.Node<LinksInAChain.ChainLink> node = links.head;
        assertEquals(0, links.size(node));
    }

    @Test
    void testZeroStrawhats() {
        assertNull(strawhats.get(0));
    }

    @Test
    void testOneStrawhat() {
        LinksInAChain.StrawHats luffy = new LinksInAChain.StrawHats("Luffy");
        strawhats.add(luffy);
        assertEquals("Luffy", strawhats.get(0).name);
    }

    @Test
    void testMultipleStrawhats() {
        LinksInAChain.StrawHats luffy = new LinksInAChain.StrawHats("Luffy");
        LinksInAChain.StrawHats zoro = new LinksInAChain.StrawHats("Zoro");
        LinksInAChain.StrawHats nami = new LinksInAChain.StrawHats("Nami");
        strawhats.add(luffy);
        strawhats.add(zoro);
        strawhats.add(nami);
        assertEquals("Luffy", strawhats.get(0).name);
        assertEquals("Zoro", strawhats.get(1).name);
        assertEquals("Nami", strawhats.get(2).name);
    }

    @Test
    void testSizeOnStrawhats() {
        LinksInAChain.StrawHats luffy = new LinksInAChain.StrawHats("Luffy");
        LinksInAChain.StrawHats zoro = new LinksInAChain.StrawHats("Zoro");
        LinksInAChain.StrawHats nami = new LinksInAChain.StrawHats("Nami");
        strawhats.add(luffy);
        strawhats.add(zoro);
        strawhats.add(nami);
        LinksInAChain.Node<StrawHats> nodeForZoro = strawhats.head;
        assertEquals(2, strawhats.size(nodeForZoro));
    }

    @Test
        void testSizeOnEmptyStrawhats() {
        LinksInAChain.Node<StrawHats> emptyNode = strawhats.head;
        assertEquals(0, strawhats.size(emptyNode));
    }

    @Test
    void testOutOfBoundsStrawhats() {
        LinksInAChain.StrawHats luffy = new LinksInAChain.StrawHats("Luffy");
        strawhats.add(luffy);
        assertNull(strawhats.get(1));
    }

    @Test
    void testZeroParts() {
        assertNull(parts.get(0));
    }

    @Test
    void testOnePart() {
        LinksInAChain.ComputerParts cpu = new LinksInAChain.ComputerParts("CPU");
        parts.add(cpu);
        assertEquals("CPU", parts.get(0).part);
    }

    @Test
    void testMultipleParts() {
        LinksInAChain.ComputerParts cpu = new LinksInAChain.ComputerParts("CPU");
        LinksInAChain.ComputerParts gpu = new LinksInAChain.ComputerParts("GPU");
        LinksInAChain.ComputerParts ram = new LinksInAChain.ComputerParts("RAM");
        parts.add(cpu);
        parts.add(gpu);
        parts.add(ram);
        assertEquals("CPU", parts.get(0).part);
        assertEquals("GPU", parts.get(1).part);
        assertEquals("RAM", parts.get(2).part);
    }

    @Test
    void testSizeOnParts() {
        LinksInAChain.ComputerParts cpu = new LinksInAChain.ComputerParts("CPU");
        LinksInAChain.ComputerParts gpu = new LinksInAChain.ComputerParts("GPU");
        LinksInAChain.ComputerParts ram = new LinksInAChain.ComputerParts("RAM");
        parts.add(cpu);
        parts.add(gpu);
        parts.add(ram);
        LinksInAChain.Node<ComputerParts> nodeForGPU = parts.head;
        assertEquals(2, parts.size(nodeForGPU));
    }

    @Test
    void testOutOfBoundsParts() {
        LinksInAChain.ComputerParts cpu = new LinksInAChain.ComputerParts("CPU");
        parts.add(cpu);
        assertNull(parts.get(1));
    }

    @Test
    void testSizeOnEmptyParts() {
        LinksInAChain.Node<ComputerParts> emptyNode = parts.head;
        assertEquals(0, parts.size(emptyNode));
    }
}
