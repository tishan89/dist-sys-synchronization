package ds.tutorial.synchronization.client;

public interface DistributedTxListener {
    void onGlobalCommit();
    void onGlobalAbort();
 }
 
