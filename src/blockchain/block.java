package blockchain;

import java.util.Arrays;
/**
 *
 * @author Kamere
 */
public class block {
    
//creating the fields
private final int previousHash;
//transaction
private final String[] transactions;
//each block will need its hash
private final int blockHash;
    
    
// creating class constructor
public block(int previousHash, String[] transactions){
this.previousHash = previousHash;
this.transactions = transactions;
Object[] contens = {Arrays.hashCode(transactions), previousHash};
this.blockHash = Arrays.hashCode(contens);    
    }


//creating getters
public int getPreviousHash() {
return previousHash;
}

public String[] getTransaction() {
return transactions;
}

public int getBlockHash() {
return blockHash;
}    
}
