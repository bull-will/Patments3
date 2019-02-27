package sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {
    private Payment payment1;
    private Payment payment2;
    PaymentsDataSource paymentsDataSource;

    @Before
    public void setUp() throws Exception {
        paymentsDataSource = PaymentsDataSource.getInstance();
    }

    @Test
    public void equals_allTheAsserts() {
        int id = (int) Math.random();
        payment1 = paymentsDataSource.getRandomPayment(id);
        payment2 = new Payment(id);
        payment2.setName(payment1.getName());
        payment2.setFullDescription(payment1.getFullDescription());
        payment2.setYear(payment1.getYear());
        payment2.setMonth(payment1.getMonth());
        payment2.setElectroTariff1(payment1.getElectroTariff1());
        payment2.setElectroLimit1(payment1.getElectroLimit1());
        payment2.setElectroTariff2(payment1.getElectroTariff2());
        payment2.setElectroLimit2(payment1.getElectroLimit2());
        payment2.setElectroTariff3(payment1.getElectroTariff3());
        payment2.setElectroLimit3(payment1.getElectroLimit3());
        payment2.setElectroTariff4(payment1.getElectroTariff4());
        payment2.setWaterTariff(payment1.getWaterTariff());
        payment2.setHotWaterTariff(payment1.getHotWaterTariff());
        payment2.setHeatingTariff(payment1.getHeatingTariff());
        payment2.setGasTariff(payment1.getGasTariff());
        payment2.setSewageTariff(payment1.getSewageTariff());
        payment2.setFlatTariff(payment1.getFlatTariff());
        payment2.setGarbageTariff(payment1.getGarbageTariff());
        payment2.setElectroPaymentSet(payment1.isElectroPaymentSet());
        payment2.setWaterPaymentSet(payment1.isWaterPaymentSet());
        payment2.setHotWaterPaymentSet(payment1.isHotWaterPaymentSet());
        payment2.setHeatingPaymentSet(payment1.isHeatingPaymentSet());
        payment2.setGasPaymentSet(payment1.isGasPaymentSet());
        payment2.setSewagePaymentSet(payment1.isSewagePaymentSet());
        payment2.setFlatPaymentSet(payment1.isFlatPaymentSet());
        payment2.setGarbagePaymentSet(payment1.isGarbagePaymentSet());
        payment2.setElectroPaymentByTariff(payment1.isElectroPaymentByTariff());
        payment2.setWaterPaymentByTariff(payment1.isWaterPaymentByTariff());
        payment2.setHotWaterPaymentByTariff(payment1.isHotWaterPaymentByTariff());
        payment2.setHeatingPaymentByTariff(payment1.isHeatingPaymentByTariff());
        payment2.setGasPaymentByTariff(payment1.isGasPaymentByTariff());
        payment2.setSewagePaymentByTariff(payment1.isSewagePaymentByTariff());
        payment2.setFlatPaymentByTariff(payment1.isFlatPaymentByTariff());
        payment2.setGarbagePaymentByTariff(payment1.isGarbagePaymentByTariff());
        payment2.setElectroMustPay(payment1.getElectroMustPay());
        payment2.setWaterMustPay(payment1.getWaterMustPay());
        payment2.setHotWaterMustPay(payment1.getHotWaterMustPay());
        payment2.setHeatingMustPay(payment1.getHeatingMustPay());
        payment2.setGasMustPay(payment1.getGasMustPay());
        payment2.setSewageMustPay(payment1.getSewageMustPay());
        payment2.setFlatMustPay(payment1.getFlatMustPay());
        payment2.setGarbageMustPay(payment1.getGarbageMustPay());
        payment2.setElectroStart(payment1.getElectroStart());
        payment2.setElectroEnd(payment1.getElectroEnd());
        payment2.setkWattConsumed(payment1.getkWattConsumed());
        payment2.setWaterStart(payment1.getWaterStart());
        payment2.setWaterEnd(payment1.getWaterEnd());
        payment2.setM3consumed(payment1.getM3consumed());
        payment2.setHotWaterStart(payment1.getHotWaterStart());
        payment2.setHotWaterEnd(payment1.getHotWaterEnd());
        payment2.setHotM3consumed(payment1.getHotM3consumed());
        payment2.setHeatingStart(payment1.getHeatingStart());
        payment2.setHeatingEnd(payment1.getHeatingEnd());
        payment2.setHeatingConsumed(payment1.getHeatingConsumed());
        payment2.setGasStart(payment1.getGasStart());
        payment2.setGasEnd(payment1.getGasEnd());
        payment2.setGasM3consumed(payment1.getGasM3consumed());
        payment2.setSewageStart(payment1.getSewageStart());
        payment2.setSewageEnd(payment1.getSewageEnd());
        payment2.setSewageM3consumed(payment1.getSewageM3consumed());
        payment2.setPaymentForElectricity(payment1.getPaymentForElectricity());
        payment2.setPaymentForWater(payment1.getPaymentForWater());
        payment2.setPaymentForHotWater(payment1.getPaymentForHotWater());
        payment2.setPaymentForHeating(payment1.getPaymentForHeating());
        payment2.setPaymentForGas(payment1.getPaymentForGas());
        payment2.setPaymentForSewage(payment1.getPaymentForSewage());
        payment2.setPaymentForFlat(payment1.getPaymentForFlat());
        payment2.setPaymentForGarbage(payment1.getPaymentForGarbage());
        payment2.setTotal(payment1.getTotal());
        payment2.setRound(payment1.isRound());

        assertTrue(payment1.equals(payment2));
        assertEquals(payment1.getName(), payment2.getName());
        assertEquals(payment1.getFullDescription(), payment2.getFullDescription());
        assertEquals(payment1.getYear(), payment2.getYear());
        assertEquals(payment1.getMonth(), payment2.getMonth());
        assertEquals(payment1.getElectroTariff1(), payment2.getElectroTariff1(), 0.01);
        assertEquals(payment1.getElectroLimit1(), payment2.getElectroLimit1());
        assertEquals(payment1.getElectroTariff2(), payment2.getElectroTariff2(), 0.01);
        assertEquals(payment1.getElectroLimit2(), payment2.getElectroLimit2());
        assertEquals(payment1.getElectroTariff3(), payment2.getElectroTariff3(), 0.01);
        assertEquals(payment1.getElectroLimit3(), payment2.getElectroLimit3());
        assertEquals(payment1.getElectroTariff4(), payment2.getElectroTariff4(), 0.01);
        assertEquals(payment1.getWaterTariff(), payment2.getWaterTariff(), 0.01);
        assertEquals(payment1.getHotWaterTariff(), payment2.getHotWaterTariff(), 0.01);
        assertEquals(payment1.getHeatingTariff(), payment2.getHeatingTariff(), 0.01);
        assertEquals(payment1.getGasTariff(), payment2.getGasTariff(), 0.01);
        assertEquals(payment1.getSewageTariff(), payment2.getSewageTariff(), 0.01);
        assertEquals(payment1.getFlatTariff(), payment2.getFlatTariff(), 0.01);
        assertEquals(payment1.getGarbageTariff(), payment2.getGarbageTariff(), 0.01);
        assertEquals(payment1.isElectroPaymentSet(), payment2.isElectroPaymentSet());
        assertEquals(payment1.isWaterPaymentSet(), payment2.isWaterPaymentSet());
        assertEquals(payment1.isHotWaterPaymentSet(), payment2.isHotWaterPaymentSet());
        assertEquals(payment1.isHeatingPaymentSet(), payment2.isHeatingPaymentSet());
        assertEquals(payment1.isGasPaymentSet(), payment2.isGasPaymentSet());
        assertEquals(payment1.isSewagePaymentSet(), payment2.isSewagePaymentSet());
        assertEquals(payment1.isFlatPaymentSet(), payment2.isFlatPaymentSet());
        assertEquals(payment1.isGarbagePaymentSet(), payment2.isGarbagePaymentSet());
        assertEquals(payment1.isElectroPaymentByTariff(), payment2.isElectroPaymentByTariff());
        assertEquals(payment1.isWaterPaymentByTariff(), payment2.isWaterPaymentByTariff());
        assertEquals(payment1.isHotWaterPaymentByTariff(), payment2.isHotWaterPaymentByTariff());
        assertEquals(payment1.isHeatingPaymentByTariff(), payment2.isHeatingPaymentByTariff());
        assertEquals(payment1.isGasPaymentByTariff(), payment2.isGasPaymentByTariff());
        assertEquals(payment1.isSewagePaymentByTariff(), payment2.isSewagePaymentByTariff());
        assertEquals(payment1.isFlatPaymentByTariff(), payment2.isFlatPaymentByTariff());
        assertEquals(payment1.isGarbagePaymentByTariff(), payment2.isGarbagePaymentByTariff());
        assertEquals(payment1.getElectroMustPay(), payment2.getElectroMustPay(), 0.01);
        assertEquals(payment1.getWaterMustPay(), payment2.getWaterMustPay(), 0.01);
        assertEquals(payment1.getHotWaterMustPay(), payment2.getHotWaterMustPay(), 0.01);
        assertEquals(payment1.getHeatingMustPay(), payment2.getHeatingMustPay(), 0.01);
        assertEquals(payment1.getGasMustPay(), payment2.getGasMustPay(), 0.01);
        assertEquals(payment1.getSewageMustPay(), payment2.getSewageMustPay(), 0.01);
        assertEquals(payment1.getFlatMustPay(), payment2.getFlatMustPay(), 0.01);
        assertEquals(payment1.getGarbageMustPay(), payment2.getGarbageMustPay(), 0.01);
        assertEquals(payment1.getElectroStart(), payment2.getElectroStart());
        assertEquals(payment1.getElectroEnd(), payment2.getElectroEnd());
        assertEquals(payment1.getkWattConsumed(), payment2.getkWattConsumed());
        assertEquals(payment1.getWaterStart(), payment2.getWaterStart());
        assertEquals(payment1.getWaterEnd(), payment2.getWaterEnd());
        assertEquals(payment1.getM3consumed(), payment2.getM3consumed());
        assertEquals(payment1.getHotWaterStart(), payment2.getHotWaterStart());
        assertEquals(payment1.getHotWaterEnd(), payment2.getHotWaterEnd());
        assertEquals(payment1.getHotM3consumed(), payment2.getHotM3consumed());
        assertEquals(payment1.getHeatingStart(), payment2.getHeatingStart());
        assertEquals(payment1.getHeatingEnd(), payment2.getHeatingEnd());
        assertEquals(payment1.getHeatingConsumed(), payment2.getHeatingConsumed());
        assertEquals(payment1.getGasStart(), payment2.getGasStart());
        assertEquals(payment1.getGasEnd(), payment2.getGasEnd());
        assertEquals(payment1.getGasM3consumed(), payment2.getGasM3consumed());
        assertEquals(payment1.getSewageStart(), payment2.getSewageStart());
        assertEquals(payment1.getSewageEnd(), payment2.getSewageEnd());
        assertEquals(payment1.getSewageM3consumed(), payment2.getSewageM3consumed());
        assertEquals(payment1.getPaymentForElectricity(), payment2.getPaymentForElectricity(), 0.01);
        assertEquals(payment1.getPaymentForWater(), payment2.getPaymentForWater(), 0.01);
        assertEquals(payment1.getPaymentForHotWater(), payment2.getPaymentForHotWater(), 0.01);
        assertEquals(payment1.getPaymentForHeating(), payment2.getPaymentForHeating(), 0.01);
        assertEquals(payment1.getPaymentForGas(), payment2.getPaymentForGas(), 0.01);
        assertEquals(payment1.getPaymentForSewage(), payment2.getPaymentForSewage(), 0.01);
        assertEquals(payment1.getPaymentForFlat(), payment2.getPaymentForFlat(), 0.01);
        assertEquals(payment1.getPaymentForGarbage(), payment2.getPaymentForGarbage(), 0.01);
        assertEquals(payment1.getTotal(), payment2.getTotal(), 0.01);
        assertEquals(payment1.isRound(), payment2.isRound());
    }
}