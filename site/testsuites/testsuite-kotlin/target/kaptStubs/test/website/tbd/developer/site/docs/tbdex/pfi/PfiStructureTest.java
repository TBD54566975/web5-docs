package website.tbd.developer.site.docs.tbdex.pfi;

@org.junit.jupiter.api.TestInstance(value = org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/pfi/PfiStructureTest;", "", "()V", "exchangesApiProvider", "Lwebsite/tbd/developer/site/docs/tbdex/pfi/ExchangesApiProvider;", "offeringsApiProvider", "Lwebsite/tbd/developer/site/docs/tbdex/pfi/OfferingsApiProvider;", "pfiDid", "Lweb5/sdk/dids/did/BearerDid;", "tbDexServer", "Ltbdex/sdk/httpserver/TbdexHttpServer;", "PFI initializes routes", "", "PFI server is initialized", "PFI server is started", "setup", "tearDown", "kotlin-testsuite"})
public final class PfiStructureTest {
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid pfiDid = null;
    private tbdex.sdk.httpserver.TbdexHttpServer tbDexServer;
    private website.tbd.developer.site.docs.tbdex.pfi.ExchangesApiProvider exchangesApiProvider;
    private website.tbd.developer.site.docs.tbdex.pfi.OfferingsApiProvider offeringsApiProvider;
    
    public PfiStructureTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeAll()
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterAll()
    public final void tearDown() {
    }
}