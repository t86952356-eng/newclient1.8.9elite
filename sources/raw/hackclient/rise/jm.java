/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.kt;
import hackclient.rise.ku;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@gl(aliases={"module.combat.staffdetector.name"}, description="module.exploit.staffdetector.description", category=gj.EXPLOIT)
public class jm
extends gi {
    private final aki xf = new aki("Auto Leave", (gi)this, (Boolean)true);
    private final akp xg = new akp("Mode", this).a(new akg[]{new ku("List", this)}).a(new akg[]{new kt("Hypixel", this)}).co("List");
    private final Set<String> xh = new HashSet<String>();

    public jm() {
        String string = "idhoom,7so,1sweet,jinaaan,ev2n,eissaa,mohmad_q8,1daykel,ximtaig_,nshme,comsterr,e9_,1meko,1lab,mk_f16,loovq,_sadeq,nv0ola,1f5amh___3oo,frecss217,xmz7,a2bod,eyeso_diamond,bunkrat,1rana,1ahmd,1heyimhasson_,casteret,1elyy,1zeyad,lt1x,firas,postme,3mmr,xl2d,yzed,y2men,iv2a,_nonameishere_,0hfault,deficency,anauri,xluffy1,kinderbueno__,_revoox_,xidayzer,i7ilin,1adam__,27bk,ventz_,awfultimes,ahm2d,gsomar,mvp11,xxkhaledxxcraft,aymann_,1iraqi,rambokinq,undertest,zswift,strongest0ne,neverletyouknow,zixgamer,sanfoor_j,ixghoul_,imbexsl_,glowdown_,hunter47,fexoranep,1reyleigh,420waffle,ywgiz,sweetyalice,xfahadq,mr3nb_,akash1004,zaytonaaa,rma7o,mr_1990,iali_305,wacros,lwwh,pynifical,rivsci,itsjuan_,meedo_qb,_r3,1speedo_,_justidk,505t,xzvv,mauveracer,_1hypersx_,rayqquaza,swivee,absqtulate,opgaming2009,vhagardracarys,luffy404,faisaal420,hdzt,sunsnipebeastwtf,_odex,1ashu,n13m_,callinu,sh59,drnyx,iisrab5bgii,haoeris,lxrayanxl,toxiclayer,greatm7md,brksfrb2,madix707,hnxrr,1sweetty,ohhhhqls,solidfying,_i_b,escoco,dreadpirater0b,aboshxm,0ryze,spuvr,va_1,kingpvp90,rieus,prebowed,mitsichu,gogglas,battlebay,32lbo,7far_8bor,evenfai,hlazny,valrm";
        for (String string2 : string.split(",")) {
            String string3;
            if (string2 == null || (string3 = string2.trim()).isEmpty()) continue;
            this.xh.add(string3.toLowerCase(Locale.ROOT));
        }
    }

    public boolean gD() {
        return (Boolean)this.xf.wD();
    }

    public boolean w(String string) {
        return this.xh.contains(string);
    }
}

