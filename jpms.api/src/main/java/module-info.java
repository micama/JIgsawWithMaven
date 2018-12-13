
module jpms.api {
    exports org.jpms.api;

    provides org.jpms.api.Greeter
            with org.jpms.api.impl.DefaultGreeter;
}
