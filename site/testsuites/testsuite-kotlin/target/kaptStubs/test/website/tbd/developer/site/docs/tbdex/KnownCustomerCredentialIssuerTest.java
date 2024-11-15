package website.tbd.developer.site.docs.tbdex;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\f\u0010\u0012\u001a\u00020\u0004*\u00020\u0013H\u0002\u00a8\u0006\u0016"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/KnownCustomerCredentialIssuerTest;", "", "()V", "JwtUtil sign() works with a valid payload and bearer DID", "", "checkIDVStatus", "", "customersDidUri", "", "create() creates credential & sign() creates JWT", "generateCNonce", "generateTestDid", "Lweb5/sdk/dids/did/BearerDid;", "generateUniquePreAuthCode", "validateSignedCNonce", "jwt", "expectedNonce", "verify() does not throw an exception for a valid JWT", "configureRouting", "Lio/ktor/server/application/Application;", "Evidence", "KccCredential", "kotlin-testsuite"})
public final class KnownCustomerCredentialIssuerTest {
    
    public KnownCustomerCredentialIssuerTest() {
        super();
    }
    
    private final web5.sdk.dids.did.BearerDid generateTestDid() {
        return null;
    }
    
    private final boolean validateSignedCNonce(java.lang.String jwt, java.lang.String expectedNonce, java.lang.String customersDidUri) {
        return false;
    }
    
    private final boolean checkIDVStatus(java.lang.String customersDidUri) {
        return false;
    }
    
    private final java.lang.String generateUniquePreAuthCode() {
        return null;
    }
    
    private final java.lang.String generateCNonce() {
        return null;
    }
    
    private final void configureRouting(io.ktor.server.application.Application $this$configureRouting) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/KnownCustomerCredentialIssuerTest$Evidence;", "", "kind", "", "checks", "", "(Ljava/lang/String;Ljava/util/List;)V", "getChecks", "()Ljava/util/List;", "getKind", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-testsuite"})
    public static final class Evidence {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String kind = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> checks = null;
        
        public Evidence(@org.jetbrains.annotations.NotNull()
        java.lang.String kind, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> checks) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKind() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getChecks() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final website.tbd.developer.site.docs.tbdex.KnownCustomerCredentialIssuerTest.Evidence copy(@org.jetbrains.annotations.NotNull()
        java.lang.String kind, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> checks) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/KnownCustomerCredentialIssuerTest$KccCredential;", "", "countryOfResidence", "", "tier", "jurisdiction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryOfResidence", "()Ljava/lang/String;", "getJurisdiction", "getTier", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-testsuite"})
    public static final class KccCredential {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String countryOfResidence = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String tier = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String jurisdiction = null;
        
        public KccCredential(@org.jetbrains.annotations.NotNull()
        java.lang.String countryOfResidence, @org.jetbrains.annotations.Nullable()
        java.lang.String tier, @org.jetbrains.annotations.Nullable()
        java.lang.String jurisdiction) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCountryOfResidence() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTier() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getJurisdiction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final website.tbd.developer.site.docs.tbdex.KnownCustomerCredentialIssuerTest.KccCredential copy(@org.jetbrains.annotations.NotNull()
        java.lang.String countryOfResidence, @org.jetbrains.annotations.Nullable()
        java.lang.String tier, @org.jetbrains.annotations.Nullable()
        java.lang.String jurisdiction) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}