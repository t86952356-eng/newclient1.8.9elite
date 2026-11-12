/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector2d
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector2d;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import hackclient.rise.aea;
import hackclient.rise.aii;
import hackclient.rise.aka;
import hackclient.rise.akd;
import javax.vecmath.Vector2d;

public class MoveAPI
implements aea {
    public boolean isMoving() {
        return aii.isMoving();
    }

    public boolean enoughMovementForSprinting() {
        return aii.enoughMovementForSprinting();
    }

    public boolean canSprint(boolean bl2) {
        return aii.canSprint(bl2);
    }

    public double speed() {
        return aii.speed();
    }

    public double movementDelta() {
        return aii.movementDelta();
    }

    public double getBaseMoveSpeed() {
        return aii.vs();
    }

    public double getAllowedHorizontalDistance() {
        return aii.getAllowedHorizontalDistance();
    }

    public double getLastVelocityDelta() {
        return aii.getLastVelocityDelta();
    }

    public void strafe() {
        aii.strafe();
    }

    public void strafe(double d2) {
        aii.strafe(d2);
    }

    public void strafeNoFriction(double d2) {
        aii.strafeNoFriction(d2);
    }

    public void stop() {
        aii.stop();
    }

    public void forward(double d2) {
        aii.forward(d2);
    }

    public double jumpMotion() {
        return aii.jumpMotion();
    }

    public double jumpBoostMotion(double d2) {
        return aii.jumpBoostMotion(d2);
    }

    public void jumpRandom(double d2) {
        aii.jumpRandom(d2);
    }

    public double predictedMotion(double d2) {
        return aii.predictedMotion(d2);
    }

    public double predictedMotion(double d2, int n2) {
        return aii.predictedMotion(d2, n2);
    }

    public double direction() {
        return aii.direction();
    }

    public double wrappedDirection() {
        return aii.wrappedDirection();
    }

    public double direction(float f2, double d2, double d3) {
        return aii.direction(f2, d2, d3);
    }

    public float moveYaw(double d2, double d3) {
        return aii.moveYaw(d2, d3);
    }

    public float getMoveX() {
        return aii.getMoveX();
    }

    public float getMoveZ() {
        return aii.getMoveZ();
    }

    public float getMoveX(float f2) {
        return aii.getMoveX(f2);
    }

    public float getMoveZ(float f2) {
        return aii.getMoveZ(f2);
    }

    public void partialStrafeMax(double d2) {
        aii.partialStrafeMax(d2);
    }

    public void partialStrafePercent(double d2) {
        aii.partialStrafePercent(d2);
    }

    public void moveFlying(double d2) {
        aii.moveFlying(d2);
    }

    public void moveFlying2(double d2, float f2) {
        aii.moveFlying2(d2, f2);
    }

    public void preventDiagonalSpeed() {
        aii.preventDiagonalSpeed();
    }

    public void useDiagonalSpeed() {
        aii.useDiagonalSpeed();
    }

    public double getMCFriction() {
        return aii.getMCFriction();
    }

    public double roundToGround(double d2) {
        return aii.roundToGround(d2);
    }

    public double speedPotionAmp(double d2) {
        return aii.speedPotionAmp(d2);
    }

    public int depthStriderLevel() {
        return aii.depthStriderLevel();
    }

    public float fallDistanceForDamage() {
        return aii.fallDistanceForDamage();
    }

    public ScriptVector2d getMotion(double d2) {
        Vector2d vector2d = aii.ac(d2);
        return new ScriptVector2d(vector2d.x, vector2d.y);
    }

    public ScriptVector2d moveFlyingVec(float f2, float f3, boolean bl2, float f4, boolean bl3) {
        aka aka2 = aii.b(f2, f3, bl2, f4, bl3);
        if (aka2 == null) {
            return null;
        }
        return new ScriptVector2d(aka2.x, aka2.y);
    }

    public Double moveFlyingSpeed(float f2, float f3, boolean bl2, float f4, boolean bl3) {
        return aii.moveFlyingSpeed(f2, f3, bl2, f4, bl3);
    }

    public Double moveFlyingSpeed(boolean bl2) {
        return aii.moveFlyingSpeed(bl2);
    }

    public double moveMaxFlying(boolean bl2) {
        return aii.moveMaxFlying(bl2);
    }

    public float simulationStrafeAngle(float f2, float f3) {
        return aii.simulationStrafeAngle(f2, f3);
    }

    public float simulationStrafe(float f2) {
        return aii.simulationStrafe(f2);
    }

    public ScriptVector3d predictedPosition() {
        akd akd2 = aii.vt();
        return new ScriptVector3d(akd2.x, akd2.y, akd2.z);
    }

    public double getWalkSpeed() {
        return 0.221;
    }

    public double getBunnySlope() {
        return 0.66;
    }

    public double getModSprinting() {
        return 1.3f;
    }

    public double getModSneak() {
        return 0.3f;
    }

    public double getModIce() {
        return 2.5;
    }

    public double getModWeb() {
        return 0.4751131221719457;
    }

    public double getJumpHeight() {
        return 0.42f;
    }

    public double getBunnyFriction() {
        return 159.9f;
    }

    public double getYOnGroundMin() {
        return 1.0E-5;
    }

    public double getYOnGroundMax() {
        return 0.0626;
    }

    public double getAirFriction() {
        return 0.98f;
    }

    public double getWaterFriction() {
        return 0.8f;
    }

    public double getLavaFriction() {
        return 0.5;
    }

    public double getModSwim() {
        return 0.5203620003898759;
    }

    public double getUnloadedChunkMotion() {
        return -0.09800000190735147;
    }

    public double getHeadHitterMotion() {
        return -0.0784000015258789;
    }
}

