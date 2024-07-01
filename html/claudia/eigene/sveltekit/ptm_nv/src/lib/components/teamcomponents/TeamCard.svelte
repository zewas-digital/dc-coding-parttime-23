<div class="card">
    <div class="card-header">
        <slot name="header"></slot>
    </div>
    <div class="card-content">
        <slot name="content"></slot>
    </div>
    <div class="card-footer">
        <slot name="footer"></slot>
    </div>
</div>

<style>
	.card{
		border: 2px solid;
		
		padding: 10px;
	}
</style>