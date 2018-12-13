module jpms.othergreeter {
    requires transitive jpms.api;

    provides org.jpms.api.Greeter with org.jpms.othergreeter.OtherGreeter;
}
