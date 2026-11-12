/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

public class MapColor {
    public static final MapColor[] bdB = new MapColor[64];
    public static final MapColor bdC = new MapColor(0, 0);
    public static final MapColor bdD = new MapColor(1, 8368696);
    public static final MapColor bdE = new MapColor(2, 16247203);
    public static final MapColor bdF = new MapColor(3, 0xC7C7C7);
    public static final MapColor bdG = new MapColor(4, 0xFF0000);
    public static final MapColor bdH = new MapColor(5, 0xA0A0FF);
    public static final MapColor bdI = new MapColor(6, 0xA7A7A7);
    public static final MapColor bdJ = new MapColor(7, 31744);
    public static final MapColor bdK = new MapColor(8, 0xFFFFFF);
    public static final MapColor bdL = new MapColor(9, 10791096);
    public static final MapColor bdM = new MapColor(10, 9923917);
    public static final MapColor bdN = new MapColor(11, 0x707070);
    public static final MapColor bdO = new MapColor(12, 0x4040FF);
    public static final MapColor bdP = new MapColor(13, 9402184);
    public static final MapColor bdQ = new MapColor(14, 0xFFFCF5);
    public static final MapColor bdR = new MapColor(15, 14188339);
    public static final MapColor bdS = new MapColor(16, 11685080);
    public static final MapColor bdT = new MapColor(17, 6724056);
    public static final MapColor bdU = new MapColor(18, 0xE5E533);
    public static final MapColor bdV = new MapColor(19, 8375321);
    public static final MapColor bdW = new MapColor(20, 15892389);
    public static final MapColor bdX = new MapColor(21, 0x4C4C4C);
    public static final MapColor bdY = new MapColor(22, 0x999999);
    public static final MapColor bdZ = new MapColor(23, 5013401);
    public static final MapColor bea = new MapColor(24, 8339378);
    public static final MapColor beb = new MapColor(25, 3361970);
    public static final MapColor bec = new MapColor(26, 6704179);
    public static final MapColor bed = new MapColor(27, 6717235);
    public static final MapColor bee = new MapColor(28, 0x993333);
    public static final MapColor bef = new MapColor(29, 0x191919);
    public static final MapColor beg = new MapColor(30, 16445005);
    public static final MapColor beh = new MapColor(31, 6085589);
    public static final MapColor bei = new MapColor(32, 4882687);
    public static final MapColor bej = new MapColor(33, 55610);
    public static final MapColor bek = new MapColor(34, 8476209);
    public static final MapColor bel = new MapColor(35, 0x700200);
    public int bem;
    public final int ben;

    private MapColor(int n2, int n3) {
        if (n2 < 0 || n2 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.ben = n2;
        this.bem = n3;
        MapColor.bdB[n2] = this;
    }

    public int bu(int n2) {
        int n3 = 220;
        if (n2 == 3) {
            n3 = 135;
        }
        if (n2 == 2) {
            n3 = 255;
        }
        if (n2 == 0) {
            n3 = 180;
        }
        int n4 = (this.bem >> 16 & 0xFF) * n3 / 255;
        int n5 = (this.bem >> 8 & 0xFF) * n3 / 255;
        int n6 = (this.bem & 0xFF) * n3 / 255;
        return 0xFF000000 | n4 << 16 | n5 << 8 | n6;
    }
}

