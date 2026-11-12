/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package rise.module.impl.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hackclient.rise.afl;
import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.bv;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;

@ModuleInfo(aliases={"Data"}, description="module.other.irc.description", category=Category.PLAYER)
public final class Data
extends Module {
    private File Ut;
    private FileWriter Uu;
    private a Uv = new a();
    private c by;
    private akd Uw = new akd(0.0, 0.0, 0.0);
    private akd Ux = new akd(0.0, 0.0, 0.0);
    private Vector2f Uy = new Vector2f(0.0f, 0.0f);
    private Vector2f Uz = new Vector2f(0.0f, 0.0f);
    private Vector2f UA = new Vector2f(0.0f, 0.0f);
    private double UB;
    @EventLink
    public final Listener<PostMotionEvent> UC = postMotionEvent -> {
        this.by = bv.e(16.0);
        if (this.by == null) {
            this.Uv.aX();
            return;
        }
        net.minecraft.client.entity.c c2 = Data.aER.bgK;
        JsonObject jsonObject = new JsonObject();
        Vector2f vector2f = this.s(this.by);
        Vector2f vector2f2 = new Vector2f(bt.bN(vector2f.getX() - Data.aER.bgK.pl), vector2f.getY() - Data.aER.bgK.pm);
        jsonObject.add("playerOffsetYaw", JsonParser.parseString((String)Double.toString(vector2f2.getX())));
        jsonObject.add("playerOffsetPitch", JsonParser.parseString((String)Double.toString(vector2f2.getY())));
        Vector2f vector2f3 = this.a(this.by, c2);
        Vector2f vector2f4 = new Vector2f(bt.bN(vector2f3.getX() - this.by.pl), vector2f3.getY() - this.by.pm);
        jsonObject.add("targetOffsetYaw", JsonParser.parseString((String)Double.toString(vector2f4.getX())));
        jsonObject.add("targetOffsetPitch", JsonParser.parseString((String)Double.toString(vector2f4.getY())));
        double d2 = c2.S(this.by);
        jsonObject.add("distance", JsonParser.parseString((String)Double.toString(d2)));
        double d3 = ahj.d(c2.crF, c2.gX, c2.crH, this.by.gW, c2.gX, this.by.gY) - ahj.d(c2.gW, c2.gX, c2.gY, this.by.gW, c2.gX, this.by.gY);
        jsonObject.add("playerDeltaHorizontalDistance", JsonParser.parseString((String)Double.toString(d3)));
        System.out.println("Data " + d3);
        double d4 = c2.crG - this.by.gX - (c2.gX - this.by.gX);
        jsonObject.add("playerDeltaVerticalDistance", JsonParser.parseString((String)Double.toString(d4)));
        double d5 = ahj.d(this.Uw.getX(), this.by.gX, this.Uw.getZ(), c2.gW, this.by.gX, c2.gY) - ahj.d(this.by.gW, this.by.gX, this.by.gY, c2.gW, this.by.gX, c2.gY);
        jsonObject.add("enemyDeltaHorizontalDistance", JsonParser.parseString((String)Double.toString(d5)));
        double d6 = this.Uw.getY() - c2.gX - (this.by.gX - c2.gX);
        jsonObject.add("enemyDeltaVerticalDistance", JsonParser.parseString((String)Double.toString(d6)));
        double d7 = Math.sqrt(Math.pow(d5, 2.0) + Math.pow(d6, 2.0));
        jsonObject.add("enemyOffsetDistance", JsonParser.parseString((String)Double.toString(d7)));
        double d8 = bt.aJ(Math.toDegrees(Math.atan2(vector2f2.getX(), vector2f2.getY())));
        jsonObject.add("twoDimensionalAngleToTarget", JsonParser.parseString((String)Double.toString(d8)));
        double d9 = this.by.gW - c2.gW;
        double d10 = this.by.gX - c2.gX;
        jsonObject.add("distancey", JsonParser.parseString((String)Double.toString(d10)));
        double d11 = this.by.gY - c2.gY;
        double d12 = c2.gW - this.Ux.getX();
        double d13 = c2.gX - this.Ux.getY();
        double d14 = c2.gY - this.Ux.getZ();
        double d15 = Math.sqrt(d12 * d12 + d13 * d13 + d14 * d14);
        double d16 = this.by.gW - this.Uw.getX();
        double d17 = this.by.gX - this.Uw.getY();
        double d18 = this.by.gY - this.Uw.getZ();
        double d19 = Math.sqrt(d16 * d16 + d17 * d17 + d18 * d18);
        double d20 = aix.a(this.s(this.by), new Vector2f(this.Uy.getX(), 0.0f), 999999.0).getX();
        d20 = Double.isNaN(d20) ? 0.0 : d20;
        jsonObject.add("deltaHorizontalAngle", JsonParser.parseString((String)Double.toString(d20)));
        double d21 = this.s(this.by).getY() - this.Uy.getY();
        jsonObject.add("deltaVerticalAngle", JsonParser.parseString((String)Double.toString(d21)));
        double d22 = bt.bN((float)(360.0 - Math.atan2(d12, d14) * 57.29577951308232 - 180.0)) + 180.0f;
        double d23 = Math.atan2(d17, aii.speed()) * 57.29577951308232;
        double d24 = bt.aJ(360.0 - Math.atan2(d16, d18) * 57.29577951308232 - 180.0) + 180.0;
        double d25 = bt.aJ((double)c2.pl - d22);
        double d26 = bt.aJ((double)this.by.pl - d24);
        double d27 = Math.abs(d25) > 90.0 ? 90.0 - Math.abs(d25) % 90.0 : Math.abs(d25) % 90.0;
        double d28 = (1.0 - bt.ah(d27 / 90.0, 0.0, 1.0)) * (double)(Math.abs(d25) > 90.0 ? -1 : 1);
        double d29 = aii.speed() * d28;
        double d30 = aii.speed() * (1.0 - Math.abs(d28)) * (double)(d25 < 0.0 ? -1 : 1);
        jsonObject.add("forwardVelocityPlayer", JsonParser.parseString((String)Double.toString(d29)));
        jsonObject.add("lateralVelocityPlayer", JsonParser.parseString((String)Double.toString(d30)));
        jsonObject.add("verticalVelocityPlayer", JsonParser.parseString((String)Double.toString(d13)));
        jsonObject.add("verticalVelocityTarget", JsonParser.parseString((String)Double.toString(d17)));
        double d31 = Math.sqrt(d16 * d16 + d18 * d18);
        double d32 = Math.abs(d26) > 90.0 ? 90.0 - Math.abs(d26) % 90.0 : Math.abs(d26) % 90.0;
        double d33 = (1.0 - bt.ah(d32 / 90.0, 0.0, 1.0)) * (double)(Math.abs(d26) > 90.0 ? -1 : 1);
        double d34 = d31 * d33;
        double d35 = d31 * (1.0 - Math.abs(d33)) * (double)(d26 < 0.0 ? -1 : 1);
        jsonObject.add("forwardVelocityTarget", JsonParser.parseString((String)Double.toString(d34)));
        jsonObject.add("lateralVelocityTarget", JsonParser.parseString((String)Double.toString(d35)));
        double d36 = bt.aJ(aix.c(new akd(c2.gW, c2.gX, c2.gY), new akd(this.by.gW, c2.gX, this.by.gY)).getX() - aix.c(new akd(c2.crF, c2.gX, c2.crH), new akd(this.by.gW, c2.gX, this.by.gY)).getX());
        jsonObject.add("playerDeltaHorizontalMovementAngle", JsonParser.parseString((String)Double.toString(d36)));
        double d37 = aix.c(new akd(c2.gW, c2.gX, c2.gY), new akd(this.by.gW, this.by.gX, this.by.gY)).getY() - aix.c(new akd(c2.gW, c2.crG, c2.gY), new akd(this.by.gW, this.by.gX, this.by.gY)).getY();
        jsonObject.add("playerDeltaVerticalMovementAngle", JsonParser.parseString((String)Double.toString(d37)));
        double d38 = bt.aJ(aix.c(new akd(this.by.gW, this.by.gX, this.by.gY), new akd(c2.gW, this.by.gX, c2.gY)).getX() - aix.c(new akd(this.Uw.getX(), this.by.gX, this.Uw.getZ()), new akd(c2.gW, this.by.gX, c2.gY)).getX());
        jsonObject.add("targetDeltaHorizontalMovementAngle", JsonParser.parseString((String)Double.toString(d38)));
        double d39 = aix.c(new akd(c2.gW, c2.gX, c2.gY), new akd(this.by.gW, this.by.gX, this.by.gY)).getY() - aix.c(new akd(c2.gW, c2.gX, c2.gY), new akd(this.by.gW, this.Uw.getY(), this.by.gY)).getY();
        jsonObject.add("targetDeltaVerticalMovementAngle", JsonParser.parseString((String)Double.toString(d39)));
        double d40 = this.UB - Math.sqrt(Math.pow(vector2f2.getX(), 2.0) + Math.pow(vector2f2.getY(), 2.0));
        jsonObject.add("deltaPlayerOffsetDistance", JsonParser.parseString((String)Double.toString(d40)));
        this.UB = Math.sqrt(Math.pow(vector2f2.getX(), 2.0) + Math.pow(vector2f2.getY(), 2.0));
        jsonObject.add("playerOffsetDistance", JsonParser.parseString((String)Double.toString(this.UB)));
        double d41 = Math.sqrt(Math.pow(c2.pl - this.Uz.getX(), 2.0) + Math.pow(c2.pm - this.Uz.getY(), 2.0));
        jsonObject.add("deltaRotation", JsonParser.parseString((String)Double.toString(d41)));
        double d42 = Math.sqrt(Math.pow(this.by.pl - this.UA.getX(), 2.0) + Math.pow(this.by.pm - this.UA.getY(), 2.0));
        jsonObject.add("targetDeltaRotation", JsonParser.parseString((String)Double.toString(d42)));
        double d43 = bt.bN(this.Uz.getX() - c2.pl);
        jsonObject.add("playerDeltaYaw", JsonParser.parseString((String)Double.toString(d43)));
        double d44 = this.Uz.getY() - c2.pm;
        jsonObject.add("playerDeltaPitch", JsonParser.parseString((String)Double.toString(d44)));
        double d45 = bt.bN(this.UA.getX() - this.by.pl);
        jsonObject.add("targetDeltaYaw", JsonParser.parseString((String)Double.toString(d45)));
        double d46 = this.UA.getY() - this.by.pm;
        jsonObject.add("targetDeltaPitch", JsonParser.parseString((String)Double.toString(d46)));
        this.Uy = this.s(this.by);
        this.Ux = new akd(Data.aER.bgK.gW, Data.aER.bgK.gX, Data.aER.bgK.gY);
        this.Uw = new akd(this.by.gW, this.by.gX, this.by.gY);
        Vector2f vector2f5 = new Vector2f(bt.bN(vector2f.getX() - vector2f2.getX()), vector2f.getY() - vector2f2.getY());
        Vector2f vector2f6 = new Vector2f(bt.bN(vector2f5.getX() - this.Uz.getX()), vector2f5.getY() - this.Uz.getY());
        Vector2f vector2f7 = new Vector2f(bt.bN(Data.aER.bgK.pl - this.Uz.getX()), Data.aER.bgK.pm - this.Uz.getY());
        if (this.Uv.T(1000L)) {
            for (Map.Entry entry : jsonObject.entrySet()) {
                this.Uu.write(((JsonElement)entry.getValue()).getAsString() + "\t");
            }
            this.Uu.write("\n");
        }
        this.Uz = new Vector2f(Data.aER.bgK.pl, Data.aER.bgK.pm);
        this.UA = new Vector2f(this.by.pl, this.by.pm);
    };

    @Override
    public void onEnable() {
        try {
            this.Ut = new File("C:\\Users\\alanw\\OneDrive\\Desktop\\data.txt");
            this.Ut.delete();
            this.Ut.createNewFile();
            this.Uu = new FileWriter("C:\\Users\\alanw\\OneDrive\\Desktop\\data.txt");
            afl.b("Started writing to file", new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            afl.b("Failed To Write File", new Object[0]);
        }
        this.Uv.aX();
    }

    @Override
    public void onDisable() {
        try {
            this.Uu.close();
            afl.b("Finished writing to file", new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            afl.b("Failed to write file", new Object[0]);
        }
    }

    public Vector2f s(c c2) {
        return this.a(Data.aER.bgK, c2);
    }

    public Vector2f a(c c2, c c3) {
        Vector2f vector2f = aix.c(c2.TN().v(0.0, c2.getEyeHeight(), 0.0), c3.TN().v(0.0, Data.aER.bgK.getEyeHeight(), 0.0));
        if (vector2f.y == 0.0f) {
            vector2f.y = Math.abs(vector2f.getY());
        }
        return vector2f;
    }
}

