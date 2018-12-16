
module jpms.main {
    requires jpms.maths;
    requires jpms.api;
    requires j2html;

    uses org.jpms.api.Greeter;
}
