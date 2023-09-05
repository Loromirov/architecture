package Abstractions;

// Абстракция класса фабрики

public abstract class ItemGeneratore {
    
    // метод взаимодействие с абстрактным продуктом
    // возвращает содержимое из разных сундуков

    public String openReward(){
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    // метод создания экземпляра продукта
    // возврат экземпляр продукта

    public abstract IGameItem createItem();

}
