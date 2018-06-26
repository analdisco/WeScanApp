package wetickets.wescanapp.domain.viewModelFactories

abstract class BaseVMF<T> {
    abstract fun mock() :T
}