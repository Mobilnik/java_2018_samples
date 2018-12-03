package eleven.enums;

/**
 * Неявно наследуется от {@link Enum}
 * Нельзя унаследоваться
 */

/*
 * internally above enum Color is converted to
class Color
{
    public static final Color RED = new Color();
    public static final Color BLUE = new Color();
    public static final Color GREEN = new Color();
}
*/
//Нельзя создать кастомный конструктор
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
