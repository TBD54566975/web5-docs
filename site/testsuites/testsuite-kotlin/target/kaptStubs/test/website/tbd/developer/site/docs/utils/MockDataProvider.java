package website.tbd.developer.site.docs.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J+\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00052\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0001J\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005JO\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00152\u0006\u0010\t\u001a\u00020\u00052\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u00012\u001c\u0010\u0017\u001a\u0018\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0004\u0012\u0002H\u00150\u0006\u00a2\u0006\u0002\u0010\u0018JC\u0010\u0019\u001a\u00020\u00142\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u00012\u001e\u0010\u0017\u001a\u001a\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u00a2\u0006\u0002\u0010\u001aJC\u0010\u001b\u001a\u00020\u00142\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u00012\u001e\u0010\u0017\u001a\u001a\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u00a2\u0006\u0002\u0010\u001aJI\u0010\u001c\u001a\u00020\u00142\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u00012$\u0010\u0017\u001a \u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00120\u0006\u00a2\u0006\u0002\u0010\u001aR2\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u001c\u0012\u001a\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lwebsite/tbd/developer/site/docs/utils/MockDataProvider;", "", "()V", "responses", "", "", "Lkotlin/Function1;", "", "execute", "methodName", "params", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", "get", "collection", "id", "insert", "data", "query", "", "setup", "", "T", "args", "response", "(Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "setupGet", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "setupInsert", "setupQuery", "kotlin-testsuite"})
public final class MockDataProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<java.lang.Object[], java.lang.Object>> responses = null;
    
    public MockDataProvider() {
        super();
    }
    
    public final <T extends java.lang.Object>void setup(@org.jetbrains.annotations.NotNull()
    java.lang.String methodName, @org.jetbrains.annotations.NotNull()
    java.lang.Object[] args, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Object[], ? extends T> response) {
    }
    
    public final void setupInsert(@org.jetbrains.annotations.NotNull()
    java.lang.Object[] args, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Object[], ? extends java.lang.Object> response) {
    }
    
    public final void setupGet(@org.jetbrains.annotations.NotNull()
    java.lang.Object[] args, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Object[], ? extends java.lang.Object> response) {
    }
    
    public final void setupQuery(@org.jetbrains.annotations.NotNull()
    java.lang.Object[] args, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Object[], ? extends java.util.List<? extends java.lang.Object>> response) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    java.lang.String methodName, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.lang.String collection, @org.jetbrains.annotations.NotNull()
    java.lang.Object data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    java.lang.String collection, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> query(@org.jetbrains.annotations.NotNull()
    java.lang.String collection, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}