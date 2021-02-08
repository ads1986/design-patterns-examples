package com.design.patterns.behavioral.chain;

public abstract class DeliveryChain {

    protected DeliveryChain next;
    protected DeliveryEnum id;

    public DeliveryChain(DeliveryEnum id) {
        this.next = null;
        this.id = id;
    }

    public void setNext(DeliveryChain delivery){
        if (next == null)
            next = delivery;
        else
            next.setNext(delivery);
    }

    public void choseCompany(DeliveryEnum id) throws Exception {
        if (canPost(id)) {
            post();
        } else {
            if (next == null)
                throw new Exception("Delivery company not found.");
            else
                next.choseCompany(id);
        }
    }

    private boolean canPost(DeliveryEnum id){
        if (this.id == id)
            return true;
        return false;
    }

    protected abstract void post();
}
