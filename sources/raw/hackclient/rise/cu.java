/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nl.hidden.Hidden0
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.cv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.er;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nl.Loader;
import nl.hidden.Hidden0;
import rip.vantage.commons.packet.impl.server.monitoring.c;
import rip.vantage.commons.packet.impl.server.monitoring.e;
import rip.vantage.commons.packet.impl.server.monitoring.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class cu
extends am {
    private static final String hY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxSC/qzVXB7Gt/I3NzffbTwndkLXbtfS4hIlWJdrzxiS67ipmciVGq97gVExGmLvsUYz9CQsjj0/cDqvlWapfDc9S79q9I9kBs1DEfttaskmpJ/hswEj84UwNdVLtaiDhnrqKXwlb1prC2gxovNFr+EMkS5yhkNUWbnBrt3iOKz5/WWcawUtS4jFRhyNIlT7S8fv/jq9je8wM/XWiWisRUuAi1YWtjp92Oz6pGf7tUR/99CFIK+s9f1VlUykSsI1xfraDcH74IczCrzTQJauKSX+bg/X5BWVwZX1XZ19LVoXySsCxstku+Po8vI4wxYp0RnRmHrXrErn28De3ytacrQIDAQAB";
    private byte[] hZ;
    private boolean ia;
    private boolean ib;
    private final Map<String, cv> ic = new LinkedHashMap<String, cv>();
    private final Map<String, byte[]> ie = new HashMap<String, byte[]>();
    private final Set<String> if = new HashSet<String>();
    @dm
    public final dk<er> ig = this::c;

    public native void cx();

    private native void a(e var1);

    private native void a(f var1);

    private native void a(c var1);

    private native void cy();

    private native void cz();

    private native /* synthetic */ void cA();

    private native /* synthetic */ void c(er var1);

    private native /* synthetic */ void lambda$new$0();

    static {
        Loader.registerNativesForClass(4, cu.class);
        Hidden0.special_clinit_4_100(cu.class);
    }
}

