package website.tbd.developer.site.docs.tbdex.wallet;

/**
 * Tests for Wallet: Sending RFQs guide
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007J\b\u0010\u0011\u001a\u00020\rH\u0007J\b\u0010\u0012\u001a\u00020\rH\u0007J\b\u0010\u0013\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/wallet/SendRfqTest;", "", "()V", "customerDid", "Lweb5/sdk/dids/did/BearerDid;", "pfi", "rfq", "Ltbdex/sdk/protocol/models/Rfq;", "selectedOffering", "Ltbdex/sdk/protocol/models/Offering;", "server", "Lokhttp3/mockwebserver/MockWebServer;", "create signed RFQ message and send to PFI", "", "get all skeleton RFQ - properties", "send RFQ message with DID as replyTo", "send RFQ message with URL as replyTo", "setup", "skeleton RFQ - metadata", "tearDown", "kotlin-testsuite"})
public final class SendRfqTest {
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid pfi = null;
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid customerDid = null;
    private tbdex.sdk.protocol.models.Offering selectedOffering;
    private okhttp3.mockwebserver.MockWebServer server;
    private tbdex.sdk.protocol.models.Rfq rfq;
    
    public SendRfqTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void tearDown() {
    }
}