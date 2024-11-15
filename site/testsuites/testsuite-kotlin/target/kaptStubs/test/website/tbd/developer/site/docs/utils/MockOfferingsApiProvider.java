package website.tbd.developer.site.docs.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lwebsite/tbd/developer/site/docs/utils/MockOfferingsApiProvider;", "Ltbdex/sdk/httpserver/models/OfferingsApi;", "()V", "dataProvider", "Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "getDataProvider", "()Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "getOffering", "Ltbdex/sdk/protocol/models/Offering;", "id", "", "getOfferings", "", "setOffering", "", "pfiDid", "Lweb5/sdk/dids/did/BearerDid;", "setOfferings", "offeringDids", "kotlin-testsuite"})
public class MockOfferingsApiProvider implements tbdex.sdk.httpserver.models.OfferingsApi {
    @org.jetbrains.annotations.NotNull()
    private final website.tbd.developer.site.docs.utils.MockDataProvider dataProvider = null;
    
    public MockOfferingsApiProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final website.tbd.developer.site.docs.utils.MockDataProvider getDataProvider() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public tbdex.sdk.protocol.models.Offering getOffering(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<tbdex.sdk.protocol.models.Offering> getOfferings() {
        return null;
    }
    
    public final void setOffering(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    web5.sdk.dids.did.BearerDid pfiDid) {
    }
    
    public final void setOfferings(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> offeringDids) {
    }
}