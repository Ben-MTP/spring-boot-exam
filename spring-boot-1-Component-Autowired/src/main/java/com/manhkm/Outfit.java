package com.manhkm;

/**
 * Mục đích tạo ra Interface Outfit.
 * Để tạo lớp trừu tượng liên quan đến Outfit.
 *      Mục đích thể hiện lên tính DI của Spring.
 * Class bậc cao sẽ không phụ thuộc vào class bậc thấp.
 * Mà chúng sẽ phụ thuộc vào một lớp Abstraction.
 */
public interface Outfit {
    public void wear();
}
