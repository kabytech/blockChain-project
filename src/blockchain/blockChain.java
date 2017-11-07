/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;
import java.util.ArrayList;
/**
 *
 * @author Kamere
 */
public class blockChain {

    //create an arraylist of blocks
ArrayList<block> blockChain = new ArrayList<>();
   
   public static void main(String[] args) {
        
        
    //genesis block  which is handcoded
    String[] genesisTransactions= {"Richard sent Tony 100000 bitcoin","Tony sent Abdallah 2 bitcoins"};
    block genesisBlock = new block(0,genesisTransactions);
    
    //creating fake transactions
    String[] block2Transactions = {"Abdallah sent 100 bitcoin to Richard", "Tony Sent 3000 bitcoin to Sam"};
    block block2 = new block(genesisBlock.getBlockHash(),block2Transactions);
    
    //block 3
    String[] block3Transactions = {"Sam sent Tony 50 bitcoins", "Sam sent 50 bitcoin to richard"};
    block block3 = new block(genesisBlock.getBlockHash(),block3Transactions);

    /*
    *Hash output for the block
    *If you change the any transaction
    *you will see how it will affect the hash of next block
    */
    System.out.println("Hash for Genesis Block");
    System.out.println(genesisBlock.getBlockHash());
    System.out.println("\nHash for the second Block");
    System.out.println(block2.getBlockHash());
    System.out.println("\nHash For third Block");
    System.out.println(block3.getBlockHash());
    }
    
}
