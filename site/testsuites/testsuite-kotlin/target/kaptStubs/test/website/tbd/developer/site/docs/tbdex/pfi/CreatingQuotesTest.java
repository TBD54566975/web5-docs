package website.tbd.developer.site.docs.tbdex.pfi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/pfi/CreatingQuotesTest;", "", "()V", "dataProvider", "Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "exchangesApiProvider", "Lwebsite/tbd/developer/site/docs/tbdex/pfi/ExchangesApiProvider;", "message", "Ltbdex/sdk/protocol/models/Message;", "offeringsApiProvider", "Lwebsite/tbd/developer/site/docs/tbdex/pfi/OfferingsApiProvider;", "pfiDid", "Lweb5/sdk/dids/did/BearerDid;", "PFI creates and signs quote", "", "setup", "kotlin-testsuite"})
public final class CreatingQuotesTest {
    private website.tbd.developer.site.docs.tbdex.pfi.OfferingsApiProvider offeringsApiProvider;
    private website.tbd.developer.site.docs.tbdex.pfi.ExchangesApiProvider exchangesApiProvider;
    private website.tbd.developer.site.docs.utils.MockDataProvider dataProvider;
    private web5.sdk.dids.did.BearerDid pfiDid;
    private tbdex.sdk.protocol.models.Message message;
    
    public CreatingQuotesTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
}