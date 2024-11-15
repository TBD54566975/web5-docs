package website.tbd.developer.site.docs.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010!\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001e\u0010\"\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nJ&\u0010#\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nJ\u001e\u0010%\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nJ8\u0010&\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\'\u001a\u00020(2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u0006\u0010*\u001a\u00020\u001cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006+"}, d2 = {"Lwebsite/tbd/developer/site/docs/utils/MockExchangesApiProvider;", "Ltbdex/sdk/httpserver/models/ExchangesApi;", "()V", "dataProvider", "Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "getDataProvider", "()Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "getClose", "Ltbdex/sdk/protocol/models/Close;", "exchangeId", "", "getExchange", "", "Ltbdex/sdk/protocol/models/Message;", "id", "requesterDid", "getExchanges", "filter", "Ltbdex/sdk/httpserver/models/GetExchangesFilter;", "getOrder", "Ltbdex/sdk/protocol/models/Order;", "getOrderStatuses", "Ltbdex/sdk/protocol/models/OrderStatus;", "getQuote", "Ltbdex/sdk/protocol/models/Quote;", "getRfq", "Ltbdex/sdk/protocol/models/Rfq;", "setClose", "", "to", "from", "closeData", "setExchange", "setExchanges", "setOrder", "setOrderStatus", "orderStatus", "setQuote", "setRfq", "offeringId", "Lde/fxlae/typeid/TypeId;", "claims", "setWrite", "kotlin-testsuite"})
public class MockExchangesApiProvider implements tbdex.sdk.httpserver.models.ExchangesApi {
    @org.jetbrains.annotations.NotNull()
    private final website.tbd.developer.site.docs.utils.MockDataProvider dataProvider = null;
    
    public MockExchangesApiProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final website.tbd.developer.site.docs.utils.MockDataProvider getDataProvider() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.util.List<tbdex.sdk.protocol.models.Message>> getExchanges(@org.jetbrains.annotations.Nullable()
    tbdex.sdk.httpserver.models.GetExchangesFilter filter) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<tbdex.sdk.protocol.models.Message> getExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String requesterDid) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public tbdex.sdk.protocol.models.Rfq getRfq(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public tbdex.sdk.protocol.models.Quote getQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public tbdex.sdk.protocol.models.Order getOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<tbdex.sdk.protocol.models.OrderStatus> getOrderStatuses(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public tbdex.sdk.protocol.models.Close getClose(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId) {
        return null;
    }
    
    public final void setExchanges(@org.jetbrains.annotations.Nullable()
    tbdex.sdk.httpserver.models.GetExchangesFilter filter) {
    }
    
    public final void setExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void setRfq(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    de.fxlae.typeid.TypeId offeringId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> claims) {
    }
    
    public final void setQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
    
    public final void setOrderStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    java.lang.String orderStatus) {
    }
    
    public final void setClose(@org.jetbrains.annotations.NotNull()
    java.lang.String exchangeId, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    java.lang.String closeData) {
    }
    
    public final void setWrite() {
    }
}