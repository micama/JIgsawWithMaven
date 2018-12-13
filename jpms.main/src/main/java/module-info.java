
module jpms.main {
    requires jpms.maths;
    requires jpms.api;

    uses org.jpms.api.Greeter;

    //exports org.jpms.main;
}
