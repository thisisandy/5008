package LookAndSayIterator;

import java.math.BigInteger;
import java.util.NoSuchElementException;

public class LookAndSayIterator implements RIterator<BigInteger> {

    private BigInteger current;
    private final BigInteger end;
    private final BigInteger start;

    public LookAndSayIterator(BigInteger seed, BigInteger end) {
        validateInput(seed, end);
        this.start = this.current = seed;
        this.end = end;
    }

    public LookAndSayIterator(BigInteger seed) {
        this(seed, new BigInteger("9".repeat(100)));
    }

    public LookAndSayIterator() {
        this(BigInteger.ONE, new BigInteger("9".repeat(100)));
    }

    @Override
    public boolean hasNext() {
        return current.compareTo(end) < 0;
    }

    @Override
    public BigInteger next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        BigInteger result = current;
        current = lookAndSay(current);
        return result;
    }

    @Override
    public boolean hasPrevious() {
        return current.compareTo(start) > 0;
    }

    @Override
    public BigInteger prev() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        BigInteger result = current;
        current = reverseLookAndSay(current);
        return result;
    }

    private void validateInput(BigInteger seed, BigInteger end) {
        if (seed.signum() <= 0 || seed.compareTo(end) >= 0 || seed.toString().contains("0")) {
            throw new IllegalArgumentException();
        }
    }

    private BigInteger lookAndSay(BigInteger input) {
        String numberStr = input.toString();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < numberStr.length()) {
            char currentChar = numberStr.charAt(i);
            int count = 0;

            while (i < numberStr.length() && numberStr.charAt(i) == currentChar) {
                i++;
                count++;
            }
            result.append(count).append(currentChar);
        }

        return new BigInteger(result.toString());
    }

    private BigInteger reverseLookAndSay(BigInteger input) {
        String numberStr = input.toString();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberStr.length(); i += 2) {
            int count = Character.getNumericValue(numberStr.charAt(i));
            char digit = numberStr.charAt(i + 1);

            result.append(String.valueOf(digit).repeat(Math.max(0, count)));
        }

        return new BigInteger(result.toString());
    }

}
