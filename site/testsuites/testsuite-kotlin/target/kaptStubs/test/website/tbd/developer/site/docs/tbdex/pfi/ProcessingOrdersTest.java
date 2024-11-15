package website.tbd.developer.site.docs.tbdex.pfi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/pfi/ProcessingOrdersTest;", "", "()V", "customerDid", "Lweb5/sdk/dids/did/BearerDid;", "dataProvider", "Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "exchangesApiProvider", "Lwebsite/tbd/developer/site/docs/tbdex/pfi/ExchangesApiProvider;", "orderMessage", "Ltbdex/sdk/protocol/models/Order;", "pfiDid", "PFI Accesses Private Data", "", "PFI creates Close and verifies it", "PFI creates orderStatus and verifies it", "setup", "kotlin-testsuite"})
public final class ProcessingOrdersTest {
    private website.tbd.developer.site.docs.utils.MockDataProvider dataProvider;
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid pfiDid = null;
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid customerDid = null;
    private website.tbd.developer.site.docs.tbdex.pfi.ExchangesApiProvider exchangesApiProvider;
    private tbdex.sdk.protocol.models.Order orderMessage;
    
    public ProcessingOrdersTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
}