package website.tbd.developer.site.docs.tbdex.wallet;

/**
 * Tests for Wallet: Manage Credentials guide
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lwebsite/tbd/developer/site/docs/tbdex/wallet/GetMatchedOfferingsTest;", "", "()V", "mockOfferings", "", "Ltbdex/sdk/protocol/models/Offering;", "pfi", "Lweb5/sdk/dids/did/BearerDid;", "pfiDid", "", "server", "Lokhttp3/mockwebserver/MockWebServer;", "vcJwtResidence", "vcJwtSanctions", "match offerings with specific criteria", "", "presentation definition is correctly extracted from offering", "selects credentials based on required claims from offering", "setup", "tearDown", "kotlin-testsuite"})
public final class GetMatchedOfferingsTest {
    private okhttp3.mockwebserver.MockWebServer server;
    @org.jetbrains.annotations.NotNull()
    private final web5.sdk.dids.did.BearerDid pfi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pfiDid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String vcJwtResidence = "eyJraWQiOiJkaWQ6ZGh0OnA5cW5idDRrd3lrenF6Znp5eXN0ZDY5Zjhnb3N0YnAzbmY3dGRyczRyd3FqaW16MWsxY3kjMCIsInR5cCI6IkpXVCIsImFsZyI6IkVkRFNBIn0.eyJpc3MiOiJkaWQ6ZGh0OnA5cW5idDRrd3lrenF6Znp5eXN0ZDY5Zjhnb3N0YnAzbmY3dGRyczRyd3FqaW16MWsxY3kiLCJzdWIiOiJkaWQ6ZGh0OnV1b3J6ZHRqOXgzYTM1OTNtZjlleXNxaHM0NWRrZXpqdzZqYXBkdWRjMXpicjc4aXNnZXkiLCJpYXQiOjE3MDc3NjM4NDgsInZjIjp7IkBjb250ZXh0IjpbImh0dHBzOi8vd3d3LnczLm9yZy8yMDE4L2NyZWRlbnRpYWxzL3YxIl0sInR5cGUiOlsiVmVyaWZpYWJsZUNyZWRlbnRpYWwiLCJSZXNpZGVuY2VDcmVkZW50aWFsIl0sImlkIjoidXJuOnV1aWQ6ODc5N2VkZDgtNzE2Mi00YTliLWEyMjgtNGRkZTA4NjFlNzZmIiwiaXNzdWVyIjoiZGlkOmRodDpwOXFuYnQ0a3d5a3pxemZ6eXlzdGQ2OWY4Z29zdGJwM25mN3RkcnM0cndxamltejFrMWN5IiwiaXNzdWFuY2VEYXRlIjoiMjAyNC0wMi0xMlQxODo1MDo0OFoiLCJjcmVkZW50aWFsU3ViamVjdCI6eyJpZCI6ImRpZDpkaHQ6dXVvcnpkdGo5eDNhMzU5M21mOWV5c3FoczQ1ZGtlemp3NmphcGR1ZGMxemJyNzhpc2dleSIsImFkZHJlc3MiOiIxMCBPcmNoYXJkIHN0In19fQ.Uvq5jHJbhe7mcPXAMNtfBoD7yez6GXP0GYNuyiZI0_pyfK_mKPjrbkJPXd3LbOtYvB06XxY6tGLMTo7tiMRFDQ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String vcJwtSanctions = "eyJraWQiOiJkaWQ6ZGh0Onc4bThxNXFja21vZXRzaWlrajR3ZXFhYWRjeGtjNjFkNjh6cnk3aHBpZmdveXE4dG1zb28jMCIsInR5cCI6IkpXVCIsImFsZyI6IkVkRFNBIn0.eyJpc3MiOiJkaWQ6ZGh0Onc4bThxNXFja21vZXRzaWlrajR3ZXFhYWRjeGtjNjFkNjh6cnk3aHBpZmdveXE4dG1zb28iLCJzdWIiOiJkaWQ6ZGh0OmtkMzVlNmN4M3pueXp1ajR3ejF1ZmRjeGs4ODlzYXVrYXRhYWc3YmNrM2NwY2I3cGM4NW8iLCJpYXQiOjE3MDc0OTEzODcsInZjIjp7IkBjb250ZXh0IjpbImh0dHBzOi8vd3d3LnczLm9yZy8yMDE4L2NyZWRlbnRpYWxzL3YxIl0sInR5cGUiOlsiVmVyaWZpYWJsZUNyZWRlbnRpYWwiLCJTYW5jdGlvbnNDcmVkZW50aWFsIl0sImlkIjoidXJuOnV1aWQ6MGU4YWJhMWYtMmMwZS00MDhlLWIxOWMtZjY0NzZiYTU3NDVhIiwiaXNzdWVyIjoiZGlkOmRodDp3OG04cTVxY2ttb2V0c2lpa2o0d2VxYWFkY3hrYzYxZDY4enJ5N2hwaWZnb3lxOHRtc29vIiwiaXNzdWFuY2VEYXRlIjoiMjAyNC0wMi0wOVQxNTowOTo0N1oiLCJjcmVkZW50aWFsU3ViamVjdCI6eyJpZCI6ImRpZDpkaHQ6a2QzNWU2Y3gzem55enVqNHd6MXVmZGN4azg4OXNhdWthdGFhZzdiY2szY3BjYjdwYzg1byIsInN0YXR1cyI6ImFwcHJvdmVkIn19fQ.Wc-qV2L3Z5WJYvUYirznpDsyk1Ntcw0kt_bhuXZDqNVXAn-d9Wta67eta-yu7V1C1T74yv6pQaqjgf2rDLxCAg";
    private java.util.List<tbdex.sdk.protocol.models.Offering> mockOfferings;
    
    public GetMatchedOfferingsTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void tearDown() {
    }
}