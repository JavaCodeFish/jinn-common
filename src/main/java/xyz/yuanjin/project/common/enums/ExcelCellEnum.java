package xyz.yuanjin.project.common.enums;

/**
 * 表格单元格列
 *
 * @author yuanjin
 */
@SuppressWarnings("unused")
public enum ExcelCellEnum {
    /**
     * 表格单元格列
     */
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    I(8),
    J(9),
    K(10),
    L(11),
    M(12),
    N(13),
    O(14),
    P(15),
    Q(16),
    R(17),
    S(18),
    T(19),
    U(20),
    V(21),
    W(22),
    X(23),
    Y(24),
    Z(25),
    AA(26),
    AB(27),
    AC(28),
    AD(29),
    AE(30),
    AF(31),
    AG(32),
    AH(33),
    AI(34),
    AJ(35),
    AK(36),
    AL(37),
    AM(38),
    AN(39),
    AO(40),
    AP(41),
    AQ(42),
    AR(43),
    AS(44),
    AT(45),
    AU(46),
    AV(47),
    AW(48),
    AX(49),
    AY(50),
    AZ(51);

    private int value;

    ExcelCellEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
