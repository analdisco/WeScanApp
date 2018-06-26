package viewModelFactories

abstract class BaseVMF<T> {
    abstract fun mock(): T
}