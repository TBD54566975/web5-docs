package website.tbd.developer.site.docs.tbdex.wallet;

/**
 * Tests for Wallet: Placing Orders guide
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/wallet/PlaceOrderTest;", "", "()V", "customerDid", "Lweb5/sdk/dids/did/BearerDid;", "getExchangeResponse", "", "pfi", "server", "Lokhttp3/mockwebserver/MockWebServer;", "listen for Order Status updates", "", "send Order message", "setup", "tearDown", "kotlin-testsuite"})
public final class PlaceOrderTest {
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid pfi = null;
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid customerDid = null;
    private okhttp3.mockwebserver.MockWebServer server;
    private java.lang.String getExchangeResponse;
    
    public PlaceOrderTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void tearDown() {
    }
}