export default "data class EmploymentCredential(\n    val position: String, \n    val startDate: String, \n    val employmentStatus: String\n)\n\nval vc = VerifiableCredential.create(\n    type = \"EmploymentCredential\",\n    issuer = employerDid.uri,\n    subject = employeeDid.uri,\n    expirationDate = Date.from(Instant.parse(\"2023-09-30T12:34:56Z\")),\n    data = EmploymentCredential(\n        position = \"Software Developer\",\n        startDate = \"2021-04-01T12:34:56Z\",\n        employmentStatus = \"Contractor\"\n    )\n)\n";