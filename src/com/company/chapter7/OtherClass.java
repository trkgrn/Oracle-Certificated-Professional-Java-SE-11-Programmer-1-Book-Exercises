package com.company.chapter7;

import com.company.chapter5.AccessModifierDifferentPackage;

class OtherClass extends AccessModifierDifferentPackage {

    public void access() {
        protectedMethod();
        publicMethod();
//        defaultMethod(); // outside package - Package Private
//        privateMethod(); // outside package - Package Private

        OtherClass test2 = new OtherClass();
        test2.publicMethod();
        test2.protectedMethod();
        //      test2.privateMethod(); // outside package - Package Private
        //      test2.defaultMethod(); // outside package - Package Private

    }
}
